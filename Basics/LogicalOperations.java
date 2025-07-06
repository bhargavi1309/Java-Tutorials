class LogicalOperations {
    public String booleanOperations(boolean a, boolean b) {
        boolean  c=a&&b;
        boolean  d=a||b;
        boolean  e = !a;
        return c+" "+d+" "+e;
    }
    public static void main(String[] args){
        LogicalOperations sol=new LogicalOperations();
        System.out.println(sol.booleanOperations(true,false));
    }
}
