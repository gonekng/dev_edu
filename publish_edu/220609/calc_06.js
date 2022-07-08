window.addEventListener("load",
    function(){
        let btnPrint = document.getElementById("add");
        btnPrint.onclick = function(){
            let section = document.querySelector("#section1");
            let box = section.children[0];
            console.log(box);

            let input_x = box.children[0]; // 태그 기준으로 자식놈 불러오기
            let input_y = box.children[1]; // 태그 기준으로 자식놈 불러오기
            console.log(input_x, input_y);

            let x,y;
            x = parseInt(input_x.value);
            y = parseInt(input_y.value);
            sum.value = x+y;
        }
    }
);