window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let srcInput = section.querySelector(".src-input");
        let colInput = section.querySelector(".color-input");
        let changeBtn = section.querySelector(".change-button");
        let img = section.querySelector(".img");

        changeBtn.onclick = function(){
            img.src = "images/" + srcInput.value;
            img.style["border-color"] = colInput.value;
            // img.style.borderColor = colInput.value; // 동일한 구문
            srcInput.value = "";
        }
    }
);