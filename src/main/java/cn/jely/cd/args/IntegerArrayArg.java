package cn.jely.cd.args;

public class IntegerArrayArg extends Arg<Integer[]>{
    @Override
    public void setValue(String value) {
        this.value = valueFromStr(value);
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = valueFromStr(defaultValue);
    }
    private Integer[] valueFromStr(String defaultValue) {
        try {
            if (defaultValue == null || "".equals(defaultValue)||"[]".equals(defaultValue)) {
                return new Integer[]{};
            } else {
                String[] strs = defaultValue.split(",");
                Integer [] result= new Integer[strs.length];
                for (int i = 0; i < strs.length; i++) {
                    result[i] = Integer.valueOf(strs[i]);
                }
                return result;
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("InCorrect Param Value,like:[1,2,3]");
        }
    }
}
