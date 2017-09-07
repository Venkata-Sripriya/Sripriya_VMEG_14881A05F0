import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import java.util.*;
public class Session extends HttpServlet
{
public void doGet(HttpServleetRequest req,HttpServletResponse res)throws ServeletException,IOException
{
res.setContentType(text/html);
PrintWriter out=res.getWriter();
HttpSession session=req.getSession(true);
Date CreateTime=new Date(session.getCreationTime());
Date LastTime=new Date(session.getLastAccessedTime());
session.setMaxInactiveInterval(60);
Integer visit=new Integer(0);
String msg="Welcome back to my site";
if(session.isNew())
{
msg="welcome to my site";
}
else
{
visit=(Integer)session.getAttribute("count");
viit=visit+1;
}
session.setAttribute("count",visit);
out.println("<h1>Session id</h1>"+session.getId());
out.println("<h1>Session creation time</h1>"+session.CreatTime());
out.println("<h1>Session last accesed time</h1>"+session.LastTime());
out.println("<h1>"+msg+"</h1>");
out.prntln("<h1>Visited count</h1>"+visit);
}
}