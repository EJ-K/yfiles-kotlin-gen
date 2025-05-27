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
 * This enumeration defines the valid priorities for [IInputHandler] processing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence">Online Documentation</a>
 */

sealed external class ParsePrecedence {
  /**
   * The data is parsed as early as possible.
   * 
   * Value - `-2147483648`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23FIRST">Online Documentation</a>
   */
  object FIRST: ParsePrecedence
  
  /**
   * The data is parsed before its owner GraphML element.
   * 
   * Value - `-20`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23BEFORE_OWNER">Online Documentation</a>
   */
  object BEFORE_OWNER: ParsePrecedence
  
  /**
   * The data is parsed after its owner GraphML element, but before any non-data child content.
   * 
   * Value - `-10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23BEFORE_CHILDREN">Online Documentation</a>
   */
  object BEFORE_CHILDREN: ParsePrecedence
  
  /**
   * Default parse priority.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23DEFAULT">Online Documentation</a>
   */
  object DEFAULT: ParsePrecedence
  
  /**
   * The data is parsed after any non-data child content, but before parsing the owner GraphML element is finished.
   * 
   * Value - `10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23AFTER_CHILDREN">Online Documentation</a>
   */
  object AFTER_CHILDREN: ParsePrecedence
  
  /**
   * The data is parsed directly after parsing the owner GraphML element is finished.
   * 
   * Value - `20`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23AFTER_OWNER">Online Documentation</a>
   */
  object AFTER_OWNER: ParsePrecedence
  
  /**
   * The data is parsed as late as possible.
   * 
   * Value - `2147483647`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParsePrecedence%23LAST">Online Documentation</a>
   */
  object LAST: ParsePrecedence
}
