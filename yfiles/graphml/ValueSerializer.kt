// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * Helper classes used during the XAML serialization of instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer">Online Documentation</a>
 */
open external class ValueSerializer   {
  /**
   * Determines whether this instance can convert the specified value from the given string.
   * @param [value] The string value to convert.
   * @param [context] The context.
   * @return `true` if this instance can convert the specified value from the string; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-canConvertFromString">Online Documentation</a>
   */
  open fun canConvertFromString(
    value: String,
    context: IValueSerializerContext?,
  ): Boolean
  
  /**
   * Determines whether this instance can convert the specified value to a string.
   * @param [value] The value.
   * @param [context] The context.
   * @return `true` if this instance can convert the specified value to a string; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-canConvertToString">Online Documentation</a>
   */
  open fun canConvertToString(
    value: Any?,
    context: IValueSerializerContext?,
  ): Boolean
  
  /**
   * Converts the string to an appropriate instance.
   * @param [value] The value to convert to an object.
   * @param [context] The context.
   * @return The converted object
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-convertFromString">Online Documentation</a>
   */
  open fun convertFromString(
    value: String,
    context: IValueSerializerContext?,
  ): Any?
  
  /**
   * Converts the given value to string.
   * @param [o] The value.
   * @param [context] The context.
   * @return The value as string representation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-convertToString">Online Documentation</a>
   */
  open fun convertToString(
    o: Any?,
    context: IValueSerializerContext?,
  ): String
  
  companion object : ClassMetadata<ValueSerializer> {
    /**
     * Gets the [ValueSerializer] implementation for the given descriptor.
     * @param [property] The descriptor.
     * @param [context] The context.
     * @return The serializer to use for the descriptor.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-getSerializerFor(Property,IValueSerializerContext)">Online Documentation</a>
     */
    fun getSerializerFor(
      property: Property,
      context: IValueSerializerContext,
    ): ValueSerializer?
    
    /**
     * Gets the [ValueSerializer] implementation for the given type.
     * @param [type] The type.
     * @param [context] The context.
     * @return The serializer to use for the type.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ValueSerializer%23ValueSerializer-method-getSerializerFor(Constructor,IValueSerializerContext)">Online Documentation</a>
     */
    fun getSerializerFor(
      type: IClassMetadata<*>,
      context: IValueSerializerContext,
    ): ValueSerializer?
  }
}
