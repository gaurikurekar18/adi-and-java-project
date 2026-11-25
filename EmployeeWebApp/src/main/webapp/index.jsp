<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>EmployeeHub | Home</title>

<style>

/* RESET */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Arial, sans-serif;
}

/* PAGE BACKGROUND */
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
    color: #ffffff;
    letter-spacing: 0.5px;
}

.logo span {
    color: #24b8f2;
}

/* NAV LINKS */
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
    box-shadow: 0 4px 15px rgba(33,196,237,0.2);
}

.nav-links .nav-register:hover {
    transform: translateY(-2px);
    box-shadow: 0 6px 20px rgba(33,196,237,0.4);
    color: white;
}

/* HERO SECTION */
.hero {
    min-height: 430px;
    padding: 75px 20px 55px;
    text-align: center;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

/* TOP BADGE */
.badge {
    display: inline-block;
    padding: 10px 20px;
    margin-bottom: 28px;
    border-radius: 30px;
    color: #c8eaff;
    background: rgba(49, 117, 202, 0.17);
    border: 1px solid rgba(77, 166, 255, 0.25);
    font-size: 14px;
}

/* MAIN HEADING */
.hero h1 {
    font-size: 52px;
    font-weight: 750;
    margin-bottom: 22px;
    color: #ffffff;
}

.hero h1 span {
    color: #27b8f2;
}

/* DESCRIPTION */
.hero p {
    max-width: 720px;
    color: #c5cce3;
    font-size: 17px;
    line-height: 1.8;
    margin-bottom: 30px;
}

/* HERO BUTTONS */
.hero-buttons {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 18px;
    flex-wrap: wrap;
}

.btn {
    display: inline-block;
    padding: 14px 27px;
    border-radius: 9px;
    text-decoration: none;
    font-size: 16px;
    font-weight: 600;
    transition: all 0.3s ease;
}

/* GET STARTED BUTTON */
.primary-btn {
    color: white;
    background: linear-gradient(135deg, #22c7e9, #3678f6);
    box-shadow: 0 5px 20px rgba(34, 160, 245, 0.25);
}

.primary-btn:hover {
    transform: translateY(-3px);
    box-shadow: 0 8px 25px rgba(34, 160, 245, 0.4);
}

/* LOGIN BUTTON */
.secondary-btn {
    color: #f4f6ff;
    background: rgba(255,255,255,0.06);
    border: 1px solid rgba(255,255,255,0.12);
}

.secondary-btn:hover {
    background: rgba(255,255,255,0.13);
    transform: translateY(-3px);
}

/* FEATURE CARDS */
.features {
    max-width: 1100px;
    margin: 0 auto;
    padding: 15px 25px 65px;
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 22px;
}

/* INDIVIDUAL CARD */
.card {
    min-height: 190px;
    padding: 30px 22px;
    text-align: center;
    background: rgba(255,255,255,0.055);
    border: 1px solid rgba(255,255,255,0.08);
    border-radius: 17px;
    transition: all 0.3s ease;
}

.card:hover {
    transform: translateY(-7px);
    background: rgba(255,255,255,0.09);
    border-color: rgba(39,184,242,0.35);
    box-shadow: 0 10px 30px rgba(0,0,0,0.15);
}

/* CARD ICON */
.card-icon {
    font-size: 38px;
    margin-bottom: 18px;
}

/* CARD HEADING */
.card h2 {
    color: #ffffff;
    font-size: 21px;
    margin-bottom: 12px;
}

/* CARD DESCRIPTION */
.card p {
    color: #b9c4e2;
    font-size: 14px;
    line-height: 1.7;
}

/* FOOTER */
footer {
    text-align: center;
    padding: 22px 15px;
    color: #9daaca;
    font-size: 13px;
    border-top: 1px solid rgba(255,255,255,0.06);
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

    .hero {
        padding: 60px 20px 40px;
    }

    .hero h1 {
        font-size: 36px;
    }

    .hero p {
        font-size: 15px;
    }

    .features {
        grid-template-columns: 1fr;
        max-width: 500px;
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

    .hero h1 {
        font-size: 30px;
    }

    .btn {
        width: 100%;
        max-width: 260px;
    }

    .hero-buttons {
        width: 100%;
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
            <a href="#features">Features</a>
        </li>

        <li>
            <a href="login.jsp">Login</a>
        </li>

        <li>
            <a href="register.jsp" class="nav-register">
                Get Started
            </a>
        </li>

    </ul>

</nav>

<!-- HERO SECTION -->
<section class="hero">

    <div class="badge">
        ✨ Smart &amp; Simple Employee Management
    </div>

    <h1>
        Welcome to <span>EmployeeHub</span>
    </h1>

    <p>
        Manage your employee journey in one place.
        Create your account, securely log in, and
        get started with a simple and modern
        employee application.
    </p>

    <div class="hero-buttons">

        <a href="register.jsp" class="btn primary-btn">
            🚀 Get Started
        </a>

        <a href="login.jsp" class="btn secondary-btn">
            🔐 Login to Account
        </a>

    </div>

</section>

<!-- FEATURES SECTION -->
<section class="features" id="features">

    <div class="card">

        <div class="card-icon">👤</div>

        <h2>Easy Registration</h2>

        <p>
            Create your employee account quickly
            with a simple registration process.
        </p>

    </div>

    <div class="card">

        <div class="card-icon">🔒</div>

        <h2>Secure Login</h2>

        <p>
            Access your account through your
            existing login credentials.
        </p>

    </div>

    <div class="card">

        <div class="card-icon">💼</div>

        <h2>Employee Management</h2>

        <p>
            Get started with a convenient
            employee management application.
        </p>

    </div>

</section>

<!-- FOOTER -->
<footer>
    &copy; 2026 EmployeeHub. All Rights Reserved.
</footer>

</body>
</html>
