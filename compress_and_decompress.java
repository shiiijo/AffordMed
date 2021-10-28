 public static String Compressed(String s) {
        int count=1;
        String ans="";
        int i=1;
        char ch=s.charAt(0);
        while(i<s.length()){
            if(s.charAt(i)==ch){
                count++;
            }
            else{
                if(count>=1){
                    ans=ans+ch+count;
                }
                else{
                    ans=ans+ch;
                }
                ch=s.charAt(i);
                count=1;

            }
            i++;

        }
        ans=ans+ch+count;
        return ans;
    }

    public static String decompress(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int c=0;
            if(Character.isDigit(ch)){
                c=Character.getNumericValue(ch);
                //System.out.println(c);
                for(int j=1;j<=c;j++){
                    ans+=s.charAt(i-1);
                }
            }

        }

    return ans;
    }
