// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

/**
 * Specifies constants for defining the search direction along edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection">Online Documentation</a>
 */

sealed external class TraversalDirection {
  /**
   * Only search along incoming edges.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23PREDECESSOR">Online Documentation</a>
   */
  object PREDECESSOR: TraversalDirection
  
  /**
   * Only search along outgoing edges.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23SUCCESSOR">Online Documentation</a>
   */
  object SUCCESSOR: TraversalDirection
  
  /**
   * Search along incoming and then along outgoing edges and combine the results.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23BOTH">Online Documentation</a>
   */
  object BOTH: TraversalDirection
  
  /**
   * Ignore direction and search along both incoming and outgoing edges.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TraversalDirection%23UNDIRECTED">Online Documentation</a>
   */
  object UNDIRECTED: TraversalDirection
}
