// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.InterfaceMetadata
import yfiles.layout.LayoutGraph

/**
 * This interface is used by [HierarchicalLayoutCore] to calculate the order of the nodes within each [layer][HierarchicalLayoutLayer].
 * @see [HierarchicalLayoutCore.fixedElementsSequencer]
 * @see [HierarchicalLayoutCore.fromScratchSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequencer">Online Documentation</a>
 */
external interface ISequencer  {
  /**
   * Calculates the sequence of the nodes within each layer of the [layers][HierarchicalLayoutContext] list in the given `layoutContext`.
   * @param [graph] the input graph
   * @param [layoutContext] The [HierarchicalLayoutContext] instance which provides access to context information about the nodes and edges of the graph, as well as the [ItemFactory] used temporarily for modifying the graph instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequencer%23ISequencer-method-sequenceNodeLayers">Online Documentation</a>
   */
  fun sequenceNodeLayers(
    graph: LayoutGraph,
    layoutContext: HierarchicalLayoutContext,
  )

  
  companion object : InterfaceMetadata<ISequencer> {
  }
}
