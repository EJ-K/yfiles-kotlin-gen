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

/**
 * Serializer that produces XAML conforming output from the target object's reflection data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlSerializer">Online Documentation</a>
 */
external class XamlSerializer private constructor()  {
  /**
   * Serialize the given object to a [IXmlWriter]
   * @param [context] The current write context
   * @param [subject] The actual object
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlSerializer%23XamlSerializer-method-serialize">Online Documentation</a>
   */
  fun serialize(
    context: IWriteContext,
    subject: Any,
  )
  
  companion object : ClassMetadata<XamlSerializer> {
    /**
     * A singleton instance of this class.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/XamlSerializer%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: XamlSerializer
  }
}
