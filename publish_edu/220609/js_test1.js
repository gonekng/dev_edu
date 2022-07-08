// window.onload = function(){}
window.addEventListener("load",
    function(){
        let printBtn = window.document.getElementById("btn");
        printBtn.onmousemove = function(){
        let x, y;
        x = eval(prompt("x값 입력하기", 0));
        y = eval(prompt("y값 입력하기", 0));
        btn.type = "text";
        btn.value = x + y;
        };
    }
);