package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException 
    {

        String url = "/index.html";

        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // mặc định
        }

        
        if (action.equals("join")) {
            url = "/index.html";
        }
        else if (action.equals("add")) {
          
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            
            User user = new User(firstName, lastName, email);
            
            String announce = request.getParameter("announce");
            String emailOK = request.getParameter("emailOK");

            String announcements = "No";
            if (announce != null) {
                announcements = "Yes";
                if (emailOK != null) {
                    announcements += " and Email me";
                }
            } else if (emailOK != null) {
                announcements = "Email me";
            }

            user.setDob(request.getParameter("date"));
            user.setHeardFrom(request.getParameter("heardFrom"));
            user.setAnnouncements(announcements);
            user.setContactVia(request.getParameter("contactVia"));

            UserDB.insert(user);

            
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }

        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }
}
