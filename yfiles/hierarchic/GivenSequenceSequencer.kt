// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode

/**
 * This class is a [ISequencer] implementation that determines the sequence of nodes on the same [layer][HierarchicalLayoutLayer] based on a given comparison function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GivenSequenceSequencer] using a given comparison for the sequencing.
 * @param [nodeComparator] An optional comparison delegate used to determine the order of the nodes in the sequence.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23GivenSequenceSequencer-constructor-GivenSequenceSequencer">Online Documentation</a>
 */
open external class GivenSequenceSequencer (
  nodeComparator: Comparison1<LayoutNode>  = definedExternally,
) : ISequencer {
  /**
   * Gets or sets the comparison function used by this [GivenSequenceSequencer] to determine the sequence of the nodes.
   * 
   * Default value - `null`. No comparison function is specified.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23sequenceComparator">Online Documentation</a>
   */
  final var sequenceComparator: Comparison1<LayoutNode>?
  
  /**
   * Calculates the sequence of the nodes within the [layers][HierarchicalLayoutContext] in the given `layoutContext` based on the specified [sequenceComparator][GivenSequenceSequencer].
   * @param [graph] The input graph
   * @param [layoutContext] The [HierarchicalLayoutContext] providing context information about the nodes and edges of the graph, as well as the [ItemFactory] used for creating and destroying helper structures.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23GivenSequenceSequencer-method-sequenceNodeLayers">Online Documentation</a>
   */
  override fun sequenceNodeLayers(
    graph: LayoutGraph,
    layoutContext: HierarchicalLayoutContext,
  )
  
  companion object : ClassMetadata<GivenSequenceSequencer> {
  }
}

inline fun GivenSequenceSequencer(
    block: GivenSequenceSequencer.() -> Unit
): GivenSequenceSequencer {
    return GivenSequenceSequencer()
        .apply(block)
}
