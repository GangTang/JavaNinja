package org.dejavu.validate;
@SuppressWarnings("unused")
public class Validate {

	private static final String DEFAULT_NOT_NAN_EX_MESSAGE =
            "The validated value is not a number";
        private static final String DEFAULT_FINITE_EX_MESSAGE =
            "The value is invalid: %f";
        private static final String DEFAULT_GREATER_EX_MESSAGE =
            "The value %s is not greater than %s";
        private static final String DEFAULT_GREATER_OR_EQUAL_EX_MESSAGE =
            "The value %s is not greater than or equal to %s";
        private static final String DEFAULT_SMALLER_EX_MESSAGE =
            "The value %s is not smaller than %s";
        private static final String DEFAULT_SMALLER_OR_EQUAL_EX_MESSAGE =
            "The value %s is not smaller than or equal to %s";
        private static final String DEFAULT_DIFFERENT_EX_MESSAGE =
            "The value %s is invalid";
        private static final String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE =
            "The value %s is not in the specified exclusive range of %s to %s";
        private static final String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE =
            "The value %s is not in the specified inclusive range of %s to %s";
        private static final String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
        private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
        private static final String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
        private static final String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE =
            "The validated array contains null element at index: %d";
        private static final String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE =
            "The validated collection contains null element at index: %d";
        private static final String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
        private static final String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
        private static final String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE =
            "The validated character sequence is empty";
        private static final String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
        private static final String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
        private static final String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
        private static final String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE =
            "The validated character sequence index is invalid: %d";
        private static final String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE =
            "The validated collection index is invalid: %d";
        private static final String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";
        private static final String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
        private static final String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";
	
    /**
     * <p>��ָ֤���Ĳ�����Ϊ {@code null};
     * �����׳�һ���쳣.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * @param <T> ��������
     * @param object  ��Ҫ���Ķ���
     * @return ����֤�Ķ��� (���÷���������Զ��Ϊ {@code null})
     * @throws NullPointerException �������Ϊ {@code null}
     * @see #notNull(Object, String, Object...)
     */
    public static <T> T notNull(final T object) {
        return notNull(object, DEFAULT_IS_NULL_EX_MESSAGE);
    }
    

    /**
     * <p>��ָ֤���Ĳ�����Ϊ {@code null};
     * �����׳�һ������ָ����Ϣ���쳣.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * @param <T> ��������
     * @param object  ��Ҫ���Ķ���
     * @param message  ���Ϊ{@code null}�����׳�����Ϣ, �ò�������Ϊnull
     * @param values  ��ʽ�����쳣��Ϣ����ѡ��
     * @return ����֤�Ķ��� (���÷���������Զ��Ϊ {@code null})
     * @throws NullPointerException �������Ϊ {@code null}
     * @see #notNull(Object)
     */
    public static <T> T notNull(final T object, final String message, final Object... values) {
        if (object == null) {
            throw new NullPointerException(String.format(message, values));
        }
        return object;
    }

    // notEmpty array
    //---------------------------------------------------------------------------------

    /**
     * <p>��ָ֤���������������Ϊ{@code null}Ҳ���ܳ���Ϊ�㣻
     * �����׳�һ������ָ����Ϣ���쳣.
     *
     * <pre>Validate.notEmpty(myArray, "The array must not be empty");</pre>
     *
     * @param <T> ��������
     * @param array  ��Ҫ��������, ͨ�����������֤��Ϊ��
     * @param message  ���Ϊ{@code null}�����׳�����Ϣ, �ò�������Ϊnull
     * @param values  ��ʽ�����쳣��Ϣ����ѡ��, ���ᳫʹ�ÿ�����
     * @return ����֤������ (���÷���������Զ��Ϊ {@code null})
     * @throws NullPointerException �������Ϊ {@code null}
     * @throws IllegalArgumentException ������鳤��Ϊ��
     * @see #notEmpty(Object[])
     */
    public static <T> T[] notEmpty(final T[] array, final String message, final Object... values) {
        if (array == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return array;
    }
    
    public static <T> T[] notEmpty(final T[] array) {
        return notEmpty(array, DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE);
    }
}
