// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

/**
 * A bus placement that places the bus connecting the child nodes in the center of the child subtrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusPlacement">Online Documentation</a>
 */

sealed external class BusPlacement {
  /**
   * A bus placement that places the bus that connects the child nodes in a leading way, left of the child subtrees.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusPlacement%23LEADING">Online Documentation</a>
   */
  object LEADING: BusPlacement
  
  /**
   * A bus placement that places the bus that connects the child nodes in a trailing way, right of the child subtrees.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusPlacement%23TRAILING">Online Documentation</a>
   */
  object TRAILING: BusPlacement
  
  /**
   * A bus placement that places the bus that connects the child nodes in the center of the child subtrees.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusPlacement%23CENTER">Online Documentation</a>
   */
  object CENTER: BusPlacement
}
