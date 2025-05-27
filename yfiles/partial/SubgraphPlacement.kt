// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

/**
 * Specifies the various strategies for positioning subgraphs during layout operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphPlacement">Online Documentation</a>
 */

sealed external class SubgraphPlacement {
  /**
   * A positioning strategy which tries to place each subgraph component close to the barycenter of its graph neighbors.
   * 
   * Value - `2`
   * @see [PartialLayout.subgraphPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphPlacement%23BARYCENTER">Online Documentation</a>
   */
  object BARYCENTER: SubgraphPlacement
  
  /**
   * A positioning strategy which tries to place each subgraph component close to its original position.
   * 
   * Value - `3`
   * @see [PartialLayout.subgraphPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphPlacement%23FROM_SKETCH">Online Documentation</a>
   */
  object FROM_SKETCH: SubgraphPlacement
}
