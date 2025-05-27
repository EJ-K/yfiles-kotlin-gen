// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

/**
 * Specifies the visibility a member has in GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLMemberVisibility">Online Documentation</a>
 */

sealed external class GraphMLMemberVisibility {
  /**
   * The member is treated according to the normal XAML serialization rules.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLMemberVisibility%23VISIBLE">Online Documentation</a>
   */
  object VISIBLE: GraphMLMemberVisibility
  
  /**
   * Only the content of a member value is read or written, without an enclosing explicit container object.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLMemberVisibility%23CONTENT">Online Documentation</a>
   */
  object CONTENT: GraphMLMemberVisibility
  
  /**
   * The member is ignored by GraphML.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLMemberVisibility%23HIDDEN">Online Documentation</a>
   */
  object HIDDEN: GraphMLMemberVisibility
}
