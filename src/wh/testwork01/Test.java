package wh.testwork01;
class Test {
    public static int  aMethod(int i) throws Exception {
        try {
            return i / 10;
        } catch (Exception e) {
            System.out.println("123");
        } finally {
            System.out.println("finally");
        }
        return i;
    }

        public static void main(String[] args) {
            try {
                aMethod(0);
            } catch (Exception e) {
                System.out.println("456");
            }

        }
    }