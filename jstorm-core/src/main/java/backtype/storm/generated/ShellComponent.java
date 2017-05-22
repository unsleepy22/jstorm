/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-2-22")
public class ShellComponent implements org.apache.thrift.TBase<ShellComponent, ShellComponent._Fields>, java.io.Serializable, Cloneable, Comparable<ShellComponent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShellComponent");

  private static final org.apache.thrift.protocol.TField EXECUTION_COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("execution_command", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SCRIPT_FIELD_DESC = new org.apache.thrift.protocol.TField("script", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ShellComponentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ShellComponentTupleSchemeFactory());
  }

  private String execution_command; // required
  private String script; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXECUTION_COMMAND((short)1, "execution_command"),
    SCRIPT((short)2, "script");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXECUTION_COMMAND
          return EXECUTION_COMMAND;
        case 2: // SCRIPT
          return SCRIPT;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTION_COMMAND, new org.apache.thrift.meta_data.FieldMetaData("execution_command", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCRIPT, new org.apache.thrift.meta_data.FieldMetaData("script", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShellComponent.class, metaDataMap);
  }

  public ShellComponent() {
  }

  public ShellComponent(
    String execution_command,
    String script)
  {
    this();
    this.execution_command = execution_command;
    this.script = script;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShellComponent(ShellComponent other) {
    if (other.is_set_execution_command()) {
      this.execution_command = other.execution_command;
    }
    if (other.is_set_script()) {
      this.script = other.script;
    }
  }

  public ShellComponent deepCopy() {
    return new ShellComponent(this);
  }

  @Override
  public void clear() {
    this.execution_command = null;
    this.script = null;
  }

  public String get_execution_command() {
    return this.execution_command;
  }

  public void set_execution_command(String execution_command) {
    this.execution_command = execution_command;
  }

  public void unset_execution_command() {
    this.execution_command = null;
  }

  /** Returns true if field execution_command is set (has been assigned a value) and false otherwise */
  public boolean is_set_execution_command() {
    return this.execution_command != null;
  }

  public void set_execution_command_isSet(boolean value) {
    if (!value) {
      this.execution_command = null;
    }
  }

  public String get_script() {
    return this.script;
  }

  public void set_script(String script) {
    this.script = script;
  }

  public void unset_script() {
    this.script = null;
  }

  /** Returns true if field script is set (has been assigned a value) and false otherwise */
  public boolean is_set_script() {
    return this.script != null;
  }

  public void set_script_isSet(boolean value) {
    if (!value) {
      this.script = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXECUTION_COMMAND:
      if (value == null) {
        unset_execution_command();
      } else {
        set_execution_command((String)value);
      }
      break;

    case SCRIPT:
      if (value == null) {
        unset_script();
      } else {
        set_script((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTION_COMMAND:
      return get_execution_command();

    case SCRIPT:
      return get_script();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXECUTION_COMMAND:
      return is_set_execution_command();
    case SCRIPT:
      return is_set_script();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ShellComponent)
      return this.equals((ShellComponent)that);
    return false;
  }

  public boolean equals(ShellComponent that) {
    if (that == null)
      return false;

    boolean this_present_execution_command = true && this.is_set_execution_command();
    boolean that_present_execution_command = true && that.is_set_execution_command();
    if (this_present_execution_command || that_present_execution_command) {
      if (!(this_present_execution_command && that_present_execution_command))
        return false;
      if (!this.execution_command.equals(that.execution_command))
        return false;
    }

    boolean this_present_script = true && this.is_set_script();
    boolean that_present_script = true && that.is_set_script();
    if (this_present_script || that_present_script) {
      if (!(this_present_script && that_present_script))
        return false;
      if (!this.script.equals(that.script))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_execution_command = true && (is_set_execution_command());
    list.add(present_execution_command);
    if (present_execution_command)
      list.add(execution_command);

    boolean present_script = true && (is_set_script());
    list.add(present_script);
    if (present_script)
      list.add(script);

    return list.hashCode();
  }

  @Override
  public int compareTo(ShellComponent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_execution_command()).compareTo(other.is_set_execution_command());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_execution_command()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.execution_command, other.execution_command);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_script()).compareTo(other.is_set_script());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_script()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.script, other.script);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ShellComponent(");
    boolean first = true;

    sb.append("execution_command:");
    if (this.execution_command == null) {
      sb.append("null");
    } else {
      sb.append(this.execution_command);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("script:");
    if (this.script == null) {
      sb.append("null");
    } else {
      sb.append(this.script);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ShellComponentStandardSchemeFactory implements SchemeFactory {
    public ShellComponentStandardScheme getScheme() {
      return new ShellComponentStandardScheme();
    }
  }

  private static class ShellComponentStandardScheme extends StandardScheme<ShellComponent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShellComponent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXECUTION_COMMAND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.execution_command = iprot.readString();
              struct.set_execution_command_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCRIPT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.script = iprot.readString();
              struct.set_script_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShellComponent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.execution_command != null) {
        oprot.writeFieldBegin(EXECUTION_COMMAND_FIELD_DESC);
        oprot.writeString(struct.execution_command);
        oprot.writeFieldEnd();
      }
      if (struct.script != null) {
        oprot.writeFieldBegin(SCRIPT_FIELD_DESC);
        oprot.writeString(struct.script);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShellComponentTupleSchemeFactory implements SchemeFactory {
    public ShellComponentTupleScheme getScheme() {
      return new ShellComponentTupleScheme();
    }
  }

  private static class ShellComponentTupleScheme extends TupleScheme<ShellComponent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShellComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_execution_command()) {
        optionals.set(0);
      }
      if (struct.is_set_script()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_execution_command()) {
        oprot.writeString(struct.execution_command);
      }
      if (struct.is_set_script()) {
        oprot.writeString(struct.script);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShellComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.execution_command = iprot.readString();
        struct.set_execution_command_isSet(true);
      }
      if (incoming.get(1)) {
        struct.script = iprot.readString();
        struct.set_script_isSet(true);
      }
    }
  }

}
