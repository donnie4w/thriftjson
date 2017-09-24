/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bln.tf.protocol;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 分页对象
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-05")
public class BlnPageBean implements org.apache.thrift.TBase<BlnPageBean, BlnPageBean._Fields>, java.io.Serializable, Cloneable, Comparable<BlnPageBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlnPageBean");

  private static final org.apache.thrift.protocol.TField ROW_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("rowNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_FLAG_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastFlagInt", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_FLAG_STR_FIELD_DESC = new org.apache.thrift.protocol.TField("lastFlagStr", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LAST_FLAG_INT2_FIELD_DESC = new org.apache.thrift.protocol.TField("lastFlagInt2", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField LAST_FLAG_STR2_FIELD_DESC = new org.apache.thrift.protocol.TField("lastFlagStr2", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PAGE_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNumber", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BlnPageBeanStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BlnPageBeanTupleSchemeFactory();

  /**
   * 每页条数
   */
  public int rowNumber; // optional
  /**
   * 最后条数标识
   */
  public int lastFlagInt; // optional
  /**
   * 最后条数标识
   */
  public java.lang.String lastFlagStr; // optional
  /**
   * 最后条数标识2
   */
  public int lastFlagInt2; // optional
  /**
   * 最后条数标识
   */
  public java.lang.String lastFlagStr2; // optional
  /**
   * 页码
   */
  public int pageNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 每页条数
     */
    ROW_NUMBER((short)1, "rowNumber"),
    /**
     * 最后条数标识
     */
    LAST_FLAG_INT((short)2, "lastFlagInt"),
    /**
     * 最后条数标识
     */
    LAST_FLAG_STR((short)3, "lastFlagStr"),
    /**
     * 最后条数标识2
     */
    LAST_FLAG_INT2((short)4, "lastFlagInt2"),
    /**
     * 最后条数标识
     */
    LAST_FLAG_STR2((short)5, "lastFlagStr2"),
    /**
     * 页码
     */
    PAGE_NUMBER((short)6, "pageNumber");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW_NUMBER
          return ROW_NUMBER;
        case 2: // LAST_FLAG_INT
          return LAST_FLAG_INT;
        case 3: // LAST_FLAG_STR
          return LAST_FLAG_STR;
        case 4: // LAST_FLAG_INT2
          return LAST_FLAG_INT2;
        case 5: // LAST_FLAG_STR2
          return LAST_FLAG_STR2;
        case 6: // PAGE_NUMBER
          return PAGE_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ROWNUMBER_ISSET_ID = 0;
  private static final int __LASTFLAGINT_ISSET_ID = 1;
  private static final int __LASTFLAGINT2_ISSET_ID = 2;
  private static final int __PAGENUMBER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ROW_NUMBER,_Fields.LAST_FLAG_INT,_Fields.LAST_FLAG_STR,_Fields.LAST_FLAG_INT2,_Fields.LAST_FLAG_STR2,_Fields.PAGE_NUMBER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("rowNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_FLAG_INT, new org.apache.thrift.meta_data.FieldMetaData("lastFlagInt", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_FLAG_STR, new org.apache.thrift.meta_data.FieldMetaData("lastFlagStr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_FLAG_INT2, new org.apache.thrift.meta_data.FieldMetaData("lastFlagInt2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_FLAG_STR2, new org.apache.thrift.meta_data.FieldMetaData("lastFlagStr2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PAGE_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("pageNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlnPageBean.class, metaDataMap);
  }

  public BlnPageBean() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlnPageBean(BlnPageBean other) {
    __isset_bitfield = other.__isset_bitfield;
    this.rowNumber = other.rowNumber;
    this.lastFlagInt = other.lastFlagInt;
    if (other.isSetLastFlagStr()) {
      this.lastFlagStr = other.lastFlagStr;
    }
    this.lastFlagInt2 = other.lastFlagInt2;
    if (other.isSetLastFlagStr2()) {
      this.lastFlagStr2 = other.lastFlagStr2;
    }
    this.pageNumber = other.pageNumber;
  }

  public BlnPageBean deepCopy() {
    return new BlnPageBean(this);
  }

  @Override
  public void clear() {
    setRowNumberIsSet(false);
    this.rowNumber = 0;
    setLastFlagIntIsSet(false);
    this.lastFlagInt = 0;
    this.lastFlagStr = null;
    setLastFlagInt2IsSet(false);
    this.lastFlagInt2 = 0;
    this.lastFlagStr2 = null;
    setPageNumberIsSet(false);
    this.pageNumber = 0;
  }

  /**
   * 每页条数
   */
  public int getRowNumber() {
    return this.rowNumber;
  }

  /**
   * 每页条数
   */
  public BlnPageBean setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
    setRowNumberIsSet(true);
    return this;
  }

  public void unsetRowNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ROWNUMBER_ISSET_ID);
  }

  /** Returns true if field rowNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetRowNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ROWNUMBER_ISSET_ID);
  }

  public void setRowNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ROWNUMBER_ISSET_ID, value);
  }

  /**
   * 最后条数标识
   */
  public int getLastFlagInt() {
    return this.lastFlagInt;
  }

  /**
   * 最后条数标识
   */
  public BlnPageBean setLastFlagInt(int lastFlagInt) {
    this.lastFlagInt = lastFlagInt;
    setLastFlagIntIsSet(true);
    return this;
  }

  public void unsetLastFlagInt() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTFLAGINT_ISSET_ID);
  }

  /** Returns true if field lastFlagInt is set (has been assigned a value) and false otherwise */
  public boolean isSetLastFlagInt() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTFLAGINT_ISSET_ID);
  }

  public void setLastFlagIntIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTFLAGINT_ISSET_ID, value);
  }

  /**
   * 最后条数标识
   */
  public java.lang.String getLastFlagStr() {
    return this.lastFlagStr;
  }

  /**
   * 最后条数标识
   */
  public BlnPageBean setLastFlagStr(java.lang.String lastFlagStr) {
    this.lastFlagStr = lastFlagStr;
    return this;
  }

  public void unsetLastFlagStr() {
    this.lastFlagStr = null;
  }

  /** Returns true if field lastFlagStr is set (has been assigned a value) and false otherwise */
  public boolean isSetLastFlagStr() {
    return this.lastFlagStr != null;
  }

  public void setLastFlagStrIsSet(boolean value) {
    if (!value) {
      this.lastFlagStr = null;
    }
  }

  /**
   * 最后条数标识2
   */
  public int getLastFlagInt2() {
    return this.lastFlagInt2;
  }

  /**
   * 最后条数标识2
   */
  public BlnPageBean setLastFlagInt2(int lastFlagInt2) {
    this.lastFlagInt2 = lastFlagInt2;
    setLastFlagInt2IsSet(true);
    return this;
  }

  public void unsetLastFlagInt2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTFLAGINT2_ISSET_ID);
  }

  /** Returns true if field lastFlagInt2 is set (has been assigned a value) and false otherwise */
  public boolean isSetLastFlagInt2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTFLAGINT2_ISSET_ID);
  }

  public void setLastFlagInt2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTFLAGINT2_ISSET_ID, value);
  }

  /**
   * 最后条数标识
   */
  public java.lang.String getLastFlagStr2() {
    return this.lastFlagStr2;
  }

  /**
   * 最后条数标识
   */
  public BlnPageBean setLastFlagStr2(java.lang.String lastFlagStr2) {
    this.lastFlagStr2 = lastFlagStr2;
    return this;
  }

  public void unsetLastFlagStr2() {
    this.lastFlagStr2 = null;
  }

  /** Returns true if field lastFlagStr2 is set (has been assigned a value) and false otherwise */
  public boolean isSetLastFlagStr2() {
    return this.lastFlagStr2 != null;
  }

  public void setLastFlagStr2IsSet(boolean value) {
    if (!value) {
      this.lastFlagStr2 = null;
    }
  }

  /**
   * 页码
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * 页码
   */
  public BlnPageBean setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
    setPageNumberIsSet(true);
    return this;
  }

  public void unsetPageNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGENUMBER_ISSET_ID);
  }

  /** Returns true if field pageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGENUMBER_ISSET_ID);
  }

  public void setPageNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ROW_NUMBER:
      if (value == null) {
        unsetRowNumber();
      } else {
        setRowNumber((java.lang.Integer)value);
      }
      break;

    case LAST_FLAG_INT:
      if (value == null) {
        unsetLastFlagInt();
      } else {
        setLastFlagInt((java.lang.Integer)value);
      }
      break;

    case LAST_FLAG_STR:
      if (value == null) {
        unsetLastFlagStr();
      } else {
        setLastFlagStr((java.lang.String)value);
      }
      break;

    case LAST_FLAG_INT2:
      if (value == null) {
        unsetLastFlagInt2();
      } else {
        setLastFlagInt2((java.lang.Integer)value);
      }
      break;

    case LAST_FLAG_STR2:
      if (value == null) {
        unsetLastFlagStr2();
      } else {
        setLastFlagStr2((java.lang.String)value);
      }
      break;

    case PAGE_NUMBER:
      if (value == null) {
        unsetPageNumber();
      } else {
        setPageNumber((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW_NUMBER:
      return getRowNumber();

    case LAST_FLAG_INT:
      return getLastFlagInt();

    case LAST_FLAG_STR:
      return getLastFlagStr();

    case LAST_FLAG_INT2:
      return getLastFlagInt2();

    case LAST_FLAG_STR2:
      return getLastFlagStr2();

    case PAGE_NUMBER:
      return getPageNumber();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROW_NUMBER:
      return isSetRowNumber();
    case LAST_FLAG_INT:
      return isSetLastFlagInt();
    case LAST_FLAG_STR:
      return isSetLastFlagStr();
    case LAST_FLAG_INT2:
      return isSetLastFlagInt2();
    case LAST_FLAG_STR2:
      return isSetLastFlagStr2();
    case PAGE_NUMBER:
      return isSetPageNumber();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BlnPageBean)
      return this.equals((BlnPageBean)that);
    return false;
  }

  public boolean equals(BlnPageBean that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_rowNumber = true && this.isSetRowNumber();
    boolean that_present_rowNumber = true && that.isSetRowNumber();
    if (this_present_rowNumber || that_present_rowNumber) {
      if (!(this_present_rowNumber && that_present_rowNumber))
        return false;
      if (this.rowNumber != that.rowNumber)
        return false;
    }

    boolean this_present_lastFlagInt = true && this.isSetLastFlagInt();
    boolean that_present_lastFlagInt = true && that.isSetLastFlagInt();
    if (this_present_lastFlagInt || that_present_lastFlagInt) {
      if (!(this_present_lastFlagInt && that_present_lastFlagInt))
        return false;
      if (this.lastFlagInt != that.lastFlagInt)
        return false;
    }

    boolean this_present_lastFlagStr = true && this.isSetLastFlagStr();
    boolean that_present_lastFlagStr = true && that.isSetLastFlagStr();
    if (this_present_lastFlagStr || that_present_lastFlagStr) {
      if (!(this_present_lastFlagStr && that_present_lastFlagStr))
        return false;
      if (!this.lastFlagStr.equals(that.lastFlagStr))
        return false;
    }

    boolean this_present_lastFlagInt2 = true && this.isSetLastFlagInt2();
    boolean that_present_lastFlagInt2 = true && that.isSetLastFlagInt2();
    if (this_present_lastFlagInt2 || that_present_lastFlagInt2) {
      if (!(this_present_lastFlagInt2 && that_present_lastFlagInt2))
        return false;
      if (this.lastFlagInt2 != that.lastFlagInt2)
        return false;
    }

    boolean this_present_lastFlagStr2 = true && this.isSetLastFlagStr2();
    boolean that_present_lastFlagStr2 = true && that.isSetLastFlagStr2();
    if (this_present_lastFlagStr2 || that_present_lastFlagStr2) {
      if (!(this_present_lastFlagStr2 && that_present_lastFlagStr2))
        return false;
      if (!this.lastFlagStr2.equals(that.lastFlagStr2))
        return false;
    }

    boolean this_present_pageNumber = true && this.isSetPageNumber();
    boolean that_present_pageNumber = true && that.isSetPageNumber();
    if (this_present_pageNumber || that_present_pageNumber) {
      if (!(this_present_pageNumber && that_present_pageNumber))
        return false;
      if (this.pageNumber != that.pageNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRowNumber()) ? 131071 : 524287);
    if (isSetRowNumber())
      hashCode = hashCode * 8191 + rowNumber;

    hashCode = hashCode * 8191 + ((isSetLastFlagInt()) ? 131071 : 524287);
    if (isSetLastFlagInt())
      hashCode = hashCode * 8191 + lastFlagInt;

    hashCode = hashCode * 8191 + ((isSetLastFlagStr()) ? 131071 : 524287);
    if (isSetLastFlagStr())
      hashCode = hashCode * 8191 + lastFlagStr.hashCode();

    hashCode = hashCode * 8191 + ((isSetLastFlagInt2()) ? 131071 : 524287);
    if (isSetLastFlagInt2())
      hashCode = hashCode * 8191 + lastFlagInt2;

    hashCode = hashCode * 8191 + ((isSetLastFlagStr2()) ? 131071 : 524287);
    if (isSetLastFlagStr2())
      hashCode = hashCode * 8191 + lastFlagStr2.hashCode();

    hashCode = hashCode * 8191 + ((isSetPageNumber()) ? 131071 : 524287);
    if (isSetPageNumber())
      hashCode = hashCode * 8191 + pageNumber;

    return hashCode;
  }

  @Override
  public int compareTo(BlnPageBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRowNumber()).compareTo(other.isSetRowNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowNumber, other.rowNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastFlagInt()).compareTo(other.isSetLastFlagInt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastFlagInt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastFlagInt, other.lastFlagInt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastFlagStr()).compareTo(other.isSetLastFlagStr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastFlagStr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastFlagStr, other.lastFlagStr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastFlagInt2()).compareTo(other.isSetLastFlagInt2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastFlagInt2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastFlagInt2, other.lastFlagInt2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastFlagStr2()).compareTo(other.isSetLastFlagStr2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastFlagStr2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastFlagStr2, other.lastFlagStr2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPageNumber()).compareTo(other.isSetPageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNumber, other.pageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BlnPageBean(");
    boolean first = true;

    if (isSetRowNumber()) {
      sb.append("rowNumber:");
      sb.append(this.rowNumber);
      first = false;
    }
    if (isSetLastFlagInt()) {
      if (!first) sb.append(", ");
      sb.append("lastFlagInt:");
      sb.append(this.lastFlagInt);
      first = false;
    }
    if (isSetLastFlagStr()) {
      if (!first) sb.append(", ");
      sb.append("lastFlagStr:");
      if (this.lastFlagStr == null) {
        sb.append("null");
      } else {
        sb.append(this.lastFlagStr);
      }
      first = false;
    }
    if (isSetLastFlagInt2()) {
      if (!first) sb.append(", ");
      sb.append("lastFlagInt2:");
      sb.append(this.lastFlagInt2);
      first = false;
    }
    if (isSetLastFlagStr2()) {
      if (!first) sb.append(", ");
      sb.append("lastFlagStr2:");
      if (this.lastFlagStr2 == null) {
        sb.append("null");
      } else {
        sb.append(this.lastFlagStr2);
      }
      first = false;
    }
    if (isSetPageNumber()) {
      if (!first) sb.append(", ");
      sb.append("pageNumber:");
      sb.append(this.pageNumber);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BlnPageBeanStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BlnPageBeanStandardScheme getScheme() {
      return new BlnPageBeanStandardScheme();
    }
  }

  private static class BlnPageBeanStandardScheme extends org.apache.thrift.scheme.StandardScheme<BlnPageBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BlnPageBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rowNumber = iprot.readI32();
              struct.setRowNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_FLAG_INT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastFlagInt = iprot.readI32();
              struct.setLastFlagIntIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_FLAG_STR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastFlagStr = iprot.readString();
              struct.setLastFlagStrIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAST_FLAG_INT2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastFlagInt2 = iprot.readI32();
              struct.setLastFlagInt2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_FLAG_STR2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lastFlagStr2 = iprot.readString();
              struct.setLastFlagStr2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PAGE_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNumber = iprot.readI32();
              struct.setPageNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BlnPageBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetRowNumber()) {
        oprot.writeFieldBegin(ROW_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.rowNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLastFlagInt()) {
        oprot.writeFieldBegin(LAST_FLAG_INT_FIELD_DESC);
        oprot.writeI32(struct.lastFlagInt);
        oprot.writeFieldEnd();
      }
      if (struct.lastFlagStr != null) {
        if (struct.isSetLastFlagStr()) {
          oprot.writeFieldBegin(LAST_FLAG_STR_FIELD_DESC);
          oprot.writeString(struct.lastFlagStr);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLastFlagInt2()) {
        oprot.writeFieldBegin(LAST_FLAG_INT2_FIELD_DESC);
        oprot.writeI32(struct.lastFlagInt2);
        oprot.writeFieldEnd();
      }
      if (struct.lastFlagStr2 != null) {
        if (struct.isSetLastFlagStr2()) {
          oprot.writeFieldBegin(LAST_FLAG_STR2_FIELD_DESC);
          oprot.writeString(struct.lastFlagStr2);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPageNumber()) {
        oprot.writeFieldBegin(PAGE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.pageNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BlnPageBeanTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BlnPageBeanTupleScheme getScheme() {
      return new BlnPageBeanTupleScheme();
    }
  }

  private static class BlnPageBeanTupleScheme extends org.apache.thrift.scheme.TupleScheme<BlnPageBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BlnPageBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRowNumber()) {
        optionals.set(0);
      }
      if (struct.isSetLastFlagInt()) {
        optionals.set(1);
      }
      if (struct.isSetLastFlagStr()) {
        optionals.set(2);
      }
      if (struct.isSetLastFlagInt2()) {
        optionals.set(3);
      }
      if (struct.isSetLastFlagStr2()) {
        optionals.set(4);
      }
      if (struct.isSetPageNumber()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetRowNumber()) {
        oprot.writeI32(struct.rowNumber);
      }
      if (struct.isSetLastFlagInt()) {
        oprot.writeI32(struct.lastFlagInt);
      }
      if (struct.isSetLastFlagStr()) {
        oprot.writeString(struct.lastFlagStr);
      }
      if (struct.isSetLastFlagInt2()) {
        oprot.writeI32(struct.lastFlagInt2);
      }
      if (struct.isSetLastFlagStr2()) {
        oprot.writeString(struct.lastFlagStr2);
      }
      if (struct.isSetPageNumber()) {
        oprot.writeI32(struct.pageNumber);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BlnPageBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.rowNumber = iprot.readI32();
        struct.setRowNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.lastFlagInt = iprot.readI32();
        struct.setLastFlagIntIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastFlagStr = iprot.readString();
        struct.setLastFlagStrIsSet(true);
      }
      if (incoming.get(3)) {
        struct.lastFlagInt2 = iprot.readI32();
        struct.setLastFlagInt2IsSet(true);
      }
      if (incoming.get(4)) {
        struct.lastFlagStr2 = iprot.readString();
        struct.setLastFlagStr2IsSet(true);
      }
      if (incoming.get(5)) {
        struct.pageNumber = iprot.readI32();
        struct.setPageNumberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
