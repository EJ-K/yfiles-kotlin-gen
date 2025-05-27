// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.collections.IListEnumerable
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class represents the result of a layout run of [MultiPageLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult">Online Documentation</a>
 */
external class MultiPageLayoutResult private constructor()  {
  /**
   * Gets the layout context that holds more information about the [MultiPageLayout] run, for example, allowing access to information about nodes and edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23context">Online Documentation</a>
   */
  final val context: MultiPageLayoutContext
  
  /**
   * Returns the page graphs.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutResult%23pageGraphs">Online Documentation</a>
   */
  final val pageGraphs: IListEnumerable<LayoutGraph>
  
  companion object : ClassMetadata<MultiPageLayoutResult> {
  }
}
