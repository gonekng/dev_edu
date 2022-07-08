window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.querySelector("#section1"); // id는 #으로 시작
            let input_x = section.querySelector("input[name='txt1']"); // class는 .으로 시작
            let input_y = section.querySelector("input[name='txt2']");
            console.log(input_x, input_y);

            let x,y;
            x = parseInt(input_x.value);
            y = parseInt(input_y.value);
            sum.value = x+y;
        }
    }
);