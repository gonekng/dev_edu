window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let changeBtn = section.querySelector(".change-button");
        let img1 = section.querySelector("#img1");
        let img2 = section.querySelector("#img2");
        let img3 = section.querySelector("#img3");
        let img4 = section.querySelector("#img4");
        let img5 = section.querySelector("#img5");
        let img6 = section.querySelector("#img6");
        let img7 = section.querySelector("#img7");
        let img8 = section.querySelector("#img8");

        changeBtn.onkeydown = function(){
            temp = img1.src;
            img1.src = img2.src;
            img2.src = img3.src;
            img3.src = img4.src;
            img4.src = img5.src;
            img5.src = img6.src;
            img6.src = img7.src;
            img7.src = img8.src;
            img8.src = temp;
        }
    }
);