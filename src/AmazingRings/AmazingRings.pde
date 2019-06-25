int x1speed =5;
int x1=400;
int x2=1000;
int w=500;
int h=500;
void setup() {
  size(1500, 1000);
}

void draw() {
  background(#F0E8E8);
  if (x1>1000) {
    x1speed=5;
  } else {
   // x1=x1+speed;
  }

  w=500;
  h=500;
  for (int i = 0; i < 50; i++) {
    noFill();
    ellipse(x1, 500, w, h);
    w=w-10;
    h=h-10;
  }
  for (int k =0; k < 50; k++) {
    x1=x1+1;
  }
  for (int i = 0; i < 50; i++) {
    noFill();
    ellipse(x2, 500, w, h);
    w=w-10;
    h=h-10;
  }
  for (int c = 0; c <50; c++) {
    x2=x2-1;
  }
}
