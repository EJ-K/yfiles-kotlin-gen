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
 * Enumeration values to control the order in which [IOutputHandler] instances are used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence">Online Documentation</a>
 */

sealed external class WritePrecedence {
  /**
   * The handler writes its content before the child nodes of the governing GraphML element.
   * 
   * Value - `-10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23BEFORE_CHILDREN">Online Documentation</a>
   */
  object BEFORE_CHILDREN: WritePrecedence
  
  /**
   * Default precedence, the order in relation to child content is unspecified.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23DEFAULT">Online Documentation</a>
   */
  object DEFAULT: WritePrecedence
  
  /**
   * The handler writes its content after the child nodes of the governing GraphML element.
   * 
   * Value - `10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23AFTER_CHILDREN">Online Documentation</a>
   */
  object AFTER_CHILDREN: WritePrecedence
}
