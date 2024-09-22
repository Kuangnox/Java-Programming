public class Approximate {
    public static void main(String[] args) {
        double pai=0.0;//近似值的和
        double sum=0.0;//一直在变的分数
        double flag;//正反数
        double common=4.0;//常数4
        double i=1.0;//逐渐增大的分母
        double b=1.0;
        for(i=1.0;i<=11;i=i+2){
            flag=1/i;
            if(i%4==3){
            flag=-flag;
            }
            sum=sum+flag;
        }
        pai=(pai+sum)*common;
        System.out.println(pai);
        pai=pai+b/13;
        System.out.println(pai);
    }
}
