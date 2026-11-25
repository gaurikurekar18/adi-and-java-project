<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>EmployeeHub | Registration</title>

<style>

/* RESET */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Arial, sans-serif;
}

/* BODY */
body {
    min-height: 100vh;
    color: white;
    background: linear-gradient(120deg, #101a3b, #1b2859, #17234d);
}

/* NAVBAR */
.navbar {
    width: 100%;
    min-height: 85px;
    padding: 20px 7%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    background: rgba(10, 17, 42, 0.95);
    border-bottom: 1px solid rgba(255,255,255,0.08);
}

/* LOGO */
.logo {
    font-size: 27px;
    font-weight: 700;
    color: white;
    letter-spacing: 0.5px;
}

.logo span {
    color: #24b8f2;
}

/* NAVIGATION LINKS */
.nav-links {
    display: flex;
    align-items: center;
    gap: 35px;
    list-style: none;
}

.nav-links a {
    color: #e4e9ff;
    text-decoration: none;
    font-size: 15px;
    font-weight: 500;
    transition: 0.3s;
}

.nav-links a:hover {
    color: #25b9f4;
}

/* NAVBAR REGISTER BUTTON */
.nav-links .nav-register {
    background: linear-gradient(135deg, #21c4ed, #3578f6);
    padding: 11px 22px;
    border-radius: 8px;
    color: white;
}

/* MAIN SECTION */
.main-container {
    min-height: calc(100vh - 85px);
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 45px 20px;
}

/* FORM CARD */
.register-card {
    width: 100%;
    max-width: 650px;
    padding: 35px 40px;
    background: rgba(255,255,255,0.06);
    border: 1px solid rgba(255,255,255,0.12);
    border-radius: 18px;
    box-shadow: 0 15px 40px rgba(0,0,0,0.25);
    animation: fadeIn 0.7s ease;
}

/* FORM HEADING */
.register-card h1 {
    text-align: center;
    font-size: 32px;
    margin-bottom: 10px;
}

.register-card h1 span {
    color: #27b8f2;
}

.subtitle {
    text-align: center;
    color: #b9c4e2;
    font-size: 14px;
    margin-bottom: 30px;
}

/* FORM GROUP */
.form-group {
    margin-bottom: 20px;
}

/* LABEL */
.form-group label {
    display: block;
    margin-bottom: 8px;
    color: #e4e9ff;
    font-size: 15px;
    font-weight: 500;
}

/* INPUT, SELECT AND TEXTAREA */
.form-group input,
.form-group select,
.form-group textarea {
    width: 100%;
    padding: 13px 15px;
    color: white;
    background: rgba(10,17,42,0.65);
    border: 1px solid rgba(255,255,255,0.15);
    border-radius: 8px;
    outline: none;
    font-size: 15px;
    transition: 0.3s;
}

/* PLACEHOLDER */
.form-group input::placeholder,
.form-group textarea::placeholder {
    color: #9daaca;
}

/* FOCUS EFFECT */
.form-group input:focus,
.form-group select:focus,
.form-group textarea:focus {
    border-color: #27b8f2;
    box-shadow: 0 0 8px rgba(39,184,242,0.2);
}

/* SELECT OPTIONS */
.form-group select option {
    background: #17234d;
    color: white;
}

/* ADDRESS */
.form-group textarea {
    resize: vertical;
    min-height: 90px;
}

/* GENDER */
.gender-options {
    display: flex;
    align-items: center;
    gap: 25px;
    flex-wrap: wrap;
}

.gender-options label {
    display: flex;
    align-items: center;
    gap: 8px;
    margin: 0;
    cursor: pointer;
    font-weight: normal;
}

.gender-options input {
    width: auto;
    accent-color: #27b8f2;
}

/* BUTTONS */
.button-group {
    display: flex;
    gap: 15px;
    margin-top: 28px;
}

/* COMMON BUTTON */
.btn {
    flex: 1;
    padding: 14px;
    border: none;
    border-radius: 8px;
    font-size: 16px;
    font-weight: 600;
    cursor: pointer;
    text-align: center;
    transition: 0.3s;
}

/* REGISTER BUTTON */
.register-btn {
    color: white;
    background: linear-gradient(135deg, #22c7e9, #3678f6);
    box-shadow: 0 5px 18px rgba(34,160,245,0.2);
}

.register-btn:hover {
    transform: translateY(-3px);
    box-shadow: 0 8px 22px rgba(34,160,245,0.4);
}

/* RESET BUTTON */
.reset-btn {
    color: #f4f6ff;
    background: rgba(255,255,255,0.08);
    border: 1px solid rgba(255,255,255,0.15);
}

.reset-btn:hover {
    background: rgba(255,255,255,0.15);
}

/* LOGIN LINK */
.login-text {
    text-align: center;
    margin-top: 25px;
    color: #b9c4e2;
    font-size: 14px;
}

.login-text a {
    color: #27b8f2;
    text-decoration: none;
    font-weight: 600;
}

.login-text a:hover {
    text-decoration: underline;
}

/* ANIMATION */
@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(20px);
    }

    to {
        opacity: 1;
        transform: translateY(0);
    }
}

/* RESPONSIVE DESIGN */
@media (max-width: 768px) {

    .navbar {
        flex-direction: column;
        gap: 22px;
        padding: 22px 15px;
    }

    .nav-links {
        gap: 18px;
        flex-wrap: wrap;
        justify-content: center;
    }

    .register-card {
        padding: 30px 22px;
    }

    .register-card h1 {
        font-size: 27px;
    }
}

@media (max-width: 400px) {

    .logo {
        font-size: 23px;
    }

    .nav-links {
        gap: 13px;
    }

    .nav-links a {
        font-size: 13px;
    }

    .button-group {
        flex-direction: column;
    }
}

</style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar">

    <div class="logo">
        👨‍💼 Employee<span>Hub</span>
    </div>

    <ul class="nav-links">

        <li>
            <a href="index.jsp">Home</a>
        </li>

        <li>
            <a href="index.jsp#features">Features</a>
        </li>

        <li>
            <a href="login.jsp">Login</a>
        </li>

        <li>
            <a href="register.jsp" class="nav-register">
                Register
            </a>
        </li>

    </ul>

</nav>

<!-- REGISTRATION SECTION -->
<main class="main-container">

    <div class="register-card">
    
    <h3 style="color:green">${successMsg}</h3>

        <h1>Create Your <span>Account</span></h1>

        <p class="subtitle">
            Join EmployeeHub and get started today!
        </p>

        <!-- REGISTRATION FORM -->
        <form action="process-registration" method="post">

            <!-- NAME -->
            <div class="form-group">

                <label for="name">Full Name</label>

                <input
                    type="text"
                    id="name"
                    name="name"
                    placeholder="Enter your full name"
                    maxlength="100"
                    autocomplete="name"
                    required>

            </div>

            <!-- EMAIL -->
            <div class="form-group">

                <label for="email">Email Address</label>

                <input
                    type="email"
                    id="email"
                    name="email"
                    placeholder="Enter your email address"
                    maxlength="254"
                    autocomplete="email"
                    required>

            </div>

            <!-- PASSWORD -->
            <div class="form-group">

                <label for="password">Password</label>

                <input
                    type="password"
                    id="password"
                    name="password"
                    placeholder="Create a password"
                    minlength="8"
                    autocomplete="new-password"
                    required>

            </div>

            <!-- DEPARTMENT -->
            <div class="form-group">

                <label for="department">Department</label>

                <select id="department" name="department" required>

                    <option value="" disabled selected>
                        Select your department
                    </option>

                    <option value="IT">IT</option>

                    <option value="HR">Human Resources (HR)</option>

                    <option value="Finance">Finance</option>

                    <option value="Marketing">Marketing</option>

                    <option value="Sales">Sales</option>

                    <option value="Operations">Operations</option>

                </select>

            </div>

            <!-- GENDER -->
            <div class="form-group">

                <label>Gender</label>

                <div class="gender-options">

                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="Male"
                            required>
                        Male
                    </label>

                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="Female">
                        Female
                    </label>

                    <label>
                        <input
                            type="radio"
                            name="gender"
                            value="Other">
                        Other
                    </label>

                </div>

            </div>

            <!-- ADDRESS -->
            <div class="form-group">

                <label for="address">Address</label>

                <textarea
                    id="address"
                    name="address"
                    placeholder="Enter your full address"
                    maxlength="500"
                    autocomplete="street-address"
                    required></textarea>

            </div>

            <!-- BUTTONS -->
            <div class="button-group">

                <button
                    type="submit"
                    class="btn register-btn">
                    Create Account
                </button>

                <button
                    type="reset"
                    class="btn reset-btn">
                    Reset
                </button>

            </div>

        </form>

        <!-- LOGIN LINK -->
        <div class="login-text">

            Already have an account?
            <a href="login.jsp">Login here</a>

        </div>

    </div>

</main>

</body>
</html>
