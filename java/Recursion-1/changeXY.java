public String changeXY(String str) {
  if (str.equals("")) return str;
  if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
  return str.charAt(0) + changeXY(str.substring(1));
}