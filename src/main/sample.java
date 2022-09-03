import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
 
public class GetCookiePrintAndSetValue {
 
  public static void main(String args[]) throws Exception {
 
    HttpClient client = new HttpClient();
    client.getParams().setParameter("j_username", "abc");
    client.getParams().setParameter("j_password", "pqr");
 
    int a = 0; //unused variable 
    String s = null;
    s.equals("sreekanth");  // null pointer exception (should handle null check) 
    GetMethod method = new GetMethod("http://localhost:8080/");
    try{
      client.executeMethod(method);
      Cookie[] cookies = client.getState().getCookies();
      for (int i = 0; i < cookies.length; i++) {
        Cookie cookie = cookies[i];
        System.err.println(
          "Cookie: " + cookie.getName() +
          ", Value: " + cookie.getValue() +
          ", IsPersistent?: " + cookie.isPersistent() +
          ", Expiry Date: " + cookie.getExpiryDate() +
          ", Comment: " + cookie.getComment());
        }
      client.executeMethod(method);
    } catch(Exception e) {
      System.err.println(e);
    } finally {
      method.releaseConnection();
    }
  }
}
