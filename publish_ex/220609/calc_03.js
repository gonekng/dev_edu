window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.getElementById("section1");
            let input_x = section.getElementsByClassName("txt1");
            let input_y = section.getElementsByClassName("txt2");
            console.log(input_x, input_y);

            let x,y;
            x = parseInt(input_x[0].value);
            y = parseInt(input_y[0].value);
            sum.value = x+y;
        }
    }
);