window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let imgSelect = section.querySelector(".img_select");
        let changeBtn = section.querySelector(".change-button");
        let img = section.querySelector(".img");

        changeBtn.onclick = function(){
            img.src = "images/" + imgSelect.value;
        }
    }
);