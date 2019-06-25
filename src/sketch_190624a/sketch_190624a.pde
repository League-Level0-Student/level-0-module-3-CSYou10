int w=500;
int h=500;
void setup() {
  size(800, 800);
}


void draw() {
  w=500;
  h=500;
  for (int i = 0; i < 50; i++) {
    if (i%2==0) {
    fill(#F51414);
    }else{
    fill(#0D0202);
    }
    ellipse(500, 500, w, h);
    w=w-10;
    h=h-10;
  }
}
