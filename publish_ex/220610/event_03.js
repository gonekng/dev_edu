window.addEventListener("load",
    function(){
        let section = this.document.querySelector("#section1");
        let container = section.querySelector(".container");
        let box1 = section.querySelector(".box1");
        let box2 = section.querySelector(".box2");
        let box3 = section.querySelector(".box3");
        let box4 = section.querySelector(".box4");
        let dragging1 = false;
        let dragging2 = false;
        let dragging3 = false;
        let dragging4 = false;
        let offset1 = {x:0, y:0};
        let offset2 = {x:0, y:0};
        let offset3 = {x:0, y:0};
        let offset4 = {x:0, y:0};

        container.onmousedown = function(e){
            if (e.target == box1){
                dragging1 = true;
            }
            if (e.target == box2){
                dragging2 = true;
            }
            if (e.target == box3){
                dragging3 = true;
            }
            if (e.target == box4){
                dragging4 = true;
            }
        }
                
        container.onmousemove = function(e){
            if (dragging1){
                // box.style.left = e.x + "px";
                // box.style.top = e.y + "px";
                box1.style.left = e.x - offset1.x + "px";
                box1.style.top = e.y - offset1.y + "px";
            }
            if (dragging2){
                // box.style.left = e.x + "px";
                // box.style.top = e.y + "px";
                box2.style.left = e.x - offset2.x + "px";
                box2.style.top = e.y - offset2.y + "px";
            }
            if (dragging3){
                // box.style.left = e.x + "px";
                // box.style.top = e.y + "px";
                box3.style.left = e.x - offset3.x + "px";
                box3.style.top = e.y - offset3.y + "px";
            }
            if (dragging4){
                // box.style.left = e.x + "px";
                // box.style.top = e.y + "px";
                box4.style.left = e.x - offset4.x + "px";
                box4.style.top = e.y - offset4.y + "px";
            }
        };

        container.onmouseup = function(e){
            if (e.target == box1){
                dragging1 = false;
            }
            if (e.target == box2){
                dragging2 = false;
            }
            if (e.target == box3){
                dragging3 = false;
            }
            if (e.target == box4){
                dragging4 = false;
            }
        }

        box1.onmousedown = function(e){
            offset1.x = e.offsetX;
            offset1.y = e.offsetY;
        }
        box2.onmousedown = function(e){
            offset2.x = e.offsetX;
            offset2.y = e.offsetY;
        }
        box3.onmousedown = function(e){
            offset3.x = e.offsetX;
            offset3.y = e.offsetY;
        }
        box4.onmousedown = function(e){
            offset4.x = e.offsetX;
            offset4.y = e.offsetY;
        }
    }
);