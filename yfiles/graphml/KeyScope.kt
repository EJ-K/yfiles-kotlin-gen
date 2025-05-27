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
 * Enumeration for the possible scopes of a GraphML attribute.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope">Online Documentation</a>
 */

sealed external class KeyScope {
  /**
   * Unscoped for key definition
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23ALL">Online Documentation</a>
   */
  object ALL: KeyScope
  
  /**
   * Node scope for key definition.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23NODE">Online Documentation</a>
   */
  object NODE: KeyScope
  
  /**
   * Edge scope for key definition.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23EDGE">Online Documentation</a>
   */
  object EDGE: KeyScope
  
  /**
   * Graph scope for key definition.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23GRAPH">Online Documentation</a>
   */
  object GRAPH: KeyScope
  
  /**
   * Port scope for key definition.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23PORT">Online Documentation</a>
   */
  object PORT: KeyScope
  
  /**
   * GraphML scope for key definition.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyScope%23GRAPHML">Online Documentation</a>
   */
  object GRAPHML: KeyScope
}
