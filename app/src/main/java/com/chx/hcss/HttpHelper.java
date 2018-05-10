package com.chx.hcss;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by win7 on 2018/5/2.
 */

public class HttpHelper {

    public static String httpGet(String url, HashMap<String, String> paras){
        String response = "";
        // 使用GET方法发送请求
        String queryString = "?";
        Iterator iterator = paras.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry item = (Map.Entry) iterator.next();
            queryString += item.getKey() + "=" + item.getValue() + "&";
        }
        queryString = queryString.substring(0, queryString.length() - 1);
        // 生成请求对象
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url + queryString);
        try {
            // 执行get请求.
            HttpResponse httpResponse = httpClient.execute(httpGet);
            // 获取响应实体
            response = getHttpResponse(httpResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String httpPost(String url, HashMap<String, String> paras){
        String response = "";
        // 使用GET方法发送请求
        List<NameValuePair> pairList = new ArrayList<NameValuePair>();
        Iterator iterator = paras.entrySet().iterator();
        while (iterator.hasNext()){
            final Map.Entry item = (Map.Entry) iterator.next();
            pairList.add(new NameValuePair() {
                @Override
                public String getName() {
                    return item.getKey().toString();
                }

                @Override
                public String getValue() {
                    return item.getValue().toString();
                }
            });
        }
        try {
            // 生成请求对象
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            // 将请求体内容加入请求中
            HttpEntity requestHttpEntity = new UrlEncodedFormEntity(pairList, "UTF-8");
            httpPost.setEntity(requestHttpEntity);
            // 执行get请求.
            HttpResponse httpResponse = httpClient.execute(httpPost);
            // 获取响应实体
            response = getHttpResponse(httpResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String httpPostJson(String url, String jsonEntity){
        String response = "";
        try {
            // 生成请求对象
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            // 将请求体内容加入请求中
            StringEntity entity = new StringEntity(jsonEntity,"UTF-8");//解决中文乱码问题
            entity.setContentEncoding("UTF-8");
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            // 执行get请求.
            HttpResponse httpResponse = httpClient.execute(httpPost);
            // 获取响应实体
            response = getHttpResponse(httpResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    private static String getHttpResponse(HttpResponse httpResponse) throws IOException {
        String result = "";
        try
        {
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity, "UTF-8");
//            InputStream inputStream = httpEntity.getContent();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    inputStream));
//            String line = "";
//            while (null != (line = reader.readLine()))
//            {
//                result += line;
//            }
            System.out.println(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    /**
     * 上传文件
     */
    public void httpUpload(String url) {
        HttpClient httpclient = new DefaultHttpClient();
//        try {
//            HttpPost httppost = new HttpPost(url);
//
//            FileBody bin = new FileBody(new File("F:\\image\\sendpix0.jpg"));
//            StringBody comment = new StringBody("A binary file of some kind", ContentType.TEXT_PLAIN);
//
//            HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("bin", bin).addPart("comment", comment).build();
//
//            httppost.setEntity(reqEntity);
//
//            System.out.println("executing request " + httppost.getRequestLine());
//            CloseableHttpResponse response = httpclient.execute(httppost);
//            try {
//                System.out.println("----------------------------------------");
//                System.out.println(response.getStatusLine());
//                HttpEntity resEntity = response.getEntity();
//                if (resEntity != null) {
//                    System.out.println("Response content length: " + resEntity.getContentLength());
//                }
//                EntityUtils.consume(resEntity);
//            } finally {
//                response.close();
//            }
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                httpclient.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
