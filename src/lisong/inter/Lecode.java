package lisong.inter;

/**
 * @author : lisong
 * @date : 2019-10-24 15:55
 * @deprecated 一导算法题
 */
public class Lecode {
    //    使用1个堆栈即可解决，依次遍历这个字符串，如果遇到是左括号就入栈到堆栈中，
//    如果遇到的是右括号，则从堆栈中取出栈顶的第一个左括号，比对一下这个左括号
//    和当前遇到的右括号是否匹配，如果不匹配这认为这整个字符串无效。如果能匹配，
//    则OK，删除这个左括号和右括号，继续往后走，继续遍历字符串中剩下的字符，
//    只要遇到左括号就入栈，只要遇到右括号就与将栈顶的左括号出栈与之比较。
//    一直走到字符串结束，再来检查堆栈中是否还有元素，如果还有元素，则这个字符串同样无效
//    ，如果堆栈为空，则字符串有效。
//
//    就以这个思路实现一个初版代码：
//    class Solution {
//        public boolean isValid(String s) {
//            java.util.Stack<Character> satck = new java.util.Stack<Character>();
//            for(int i=0; i<s.length();i++){
//                char c = s.charAt(i);
//                if(c=='(' || c=='{' || c=='['){
//                    satck.push(c);
//                }else{
//                    if(satck.isEmpty()) return false;
//                    char temp = satck.pop();
//                    if( (temp=='('&&c==')') || (temp=='{'&&c=='}')  || (temp=='['&&c==']') ){
//                        continue;
//                    }else{
//                        return false;
//                    }
//                }
//            }
//            return satck.isEmpty();
//        }
//    }
//    这个代码的时间复杂度o(n),空间复杂度o(n)搞定。
//
//    但是想了想，好像代码不是很优雅，写了一个优化版，提前将左右括号放入到MAP中，这个方法的时间和空间复杂度跟上面的一样。
//    class Solution {
//        public boolean isValid(String s) {
//            java.util.Stack<Character> stack = new java.util.Stack<Character>();
//            java.util.HashMap<Character, Character> map = new java.util.HashMap<Character, Character>();
//            map.put('(', ')');
//            map.put('{','}' );
//            map.put('[', ']');
//
//            for(int i=0;i<s.length();i++){
//                char c = s.charAt(i);
//                if(map.containsKey(c)){
//                    stack.push(c);
//                }else{
//                    if(stack.isEmpty()) return false;
//                    char temp = stack.pop();
//                    if(map.get(temp)!=c) return false;
//                }
//            }
//            return stack.isEmpty();
//        }
//    }
//
//    继续思考有没有更简洁的方法，竟然在leetcode上找到了一个：
//    但是这个方法并没有用到堆栈哦，它的思路是不断的遍历这个字符串，
//    将字符串中的(){}[]全部调换成空字符串，如果最后全部替换完成了，
//    并且字符串为空了，就说明字符串是有效的，否者就是无效的字符串。
//    class Solution {
//        public boolean isValid(String s) {
//            int length = s.length();
//            do{
//                length = s.length();
//                s = s.replaceAll("\\(\\)","").replaceAll("\\{\\}","").replaceAll("\\[\\]","");
//            }while(s.length()!=length);
//            return s.length()==0;
//        }
//    }
}
