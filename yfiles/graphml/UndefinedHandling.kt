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
 * Enumeration that controls how undefined value is treated in (de-)serialization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndefinedHandling">Online Documentation</a>
 */

sealed external class UndefinedHandling {
  /**
   * Explicitly read and write undefined values.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndefinedHandling%23EXPLICIT">Online Documentation</a>
   */
  object EXPLICIT: UndefinedHandling
  
  /**
   * Throw an exception when undefined values are encountered.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndefinedHandling%23THROW">Online Documentation</a>
   */
  object THROW: UndefinedHandling
  
  /**
   * Treat undefined values like null values.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndefinedHandling%23AS_NULL">Online Documentation</a>
   */
  object AS_NULL: UndefinedHandling
  
  /**
   * Treat undefined values as default values.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/UndefinedHandling%23AS_DEFAULT">Online Documentation</a>
   */
  object AS_DEFAULT: UndefinedHandling
}
