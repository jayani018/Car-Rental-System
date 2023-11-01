const showPopupBtn = document.querySelector(".btn-login-user");
const hidePopupBtn = document.querySelector(".form-popup .close-btn");

showPopupBtn.addEventListener("click", () => {
    document.body.classList.toggle("show-popup");
});

hidePopupBtn.addEventListener("click", () => showPopupBtn.click());

let  baseUrlLogin = "http://localhost:8080/car_Rent_Back_End_war/";

$("#btnLogin").on("click",function () {
    login;
});

function login() {
    let loginRole = $("").val();
    let loginUserName = $("#userName").val();
    let loginPassword = $("#password").val();

    $.ajax({
        url: baseUrlLogin + "loginForm",
        contentType: "application/json",
        dataType: "json",
        success: function (res) {
            for (var login of res.data) {
                if (loginRole_Type === login.role_Type && loginUserName === login.userName && loginPassword === login.password) {
                    if (loginRole_Type === "DRIVER" && loginUserName === login.userName && loginPassword === login.password) {
                        $.ajax({
                            url: baseUrlLogin + "loginForm/?username=" + loginUserName + "&password=" + loginPassword,
                            data: res.data,
                            method: "get",
                            success: function (res1) {
                            }
                        })
                        window.location.href = 'driverDashboard.html';
                    } else if (loginRole_Type === "REGISTERED_USER" && loginUserName === login.user_Name && loginPassword === login.password) {
                        $.ajax({
                            url: baseUrlLogin + "loginForm/?username=" + loginUserName + "&password=" + loginPassword,
                            data: res.data,
                            method: "get",
                            success: function (res1) {
                            }
                        });
                        window.location.href = 'reg_UserDashboard.html';
                    } else if (loginRole_Type === "ADMIN" && loginUserName === login.user_Name && loginPassword === login.password) {
                        window.location.href = 'adminDashboard.html';
                    }
                    return;
                }
            }
        }
    });
}
