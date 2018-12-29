package servlets;

import models.User;
import repositories.UserRepository;
import repositories.UserRepositoryInMemory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private UserRepository userRepository;

    @Override
    public void init(){
       this.userRepository = new UserRepositoryInMemory();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<User> users = userRepository.findAll();
        req.setAttribute("usersFromServer", users);
        RequestDispatcher requestDispatcher = req.getServletContext().getRequestDispatcher("/jsp/signUp.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String  password = req.getParameter("password");
        User user = new User(name,password);
        userRepository.save(user);
        doGet(req, resp);
    }
}
