// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a [ISequencer] implementation that determines the sequence of nodes of the same [layer][ILayer] based on a given [comparator][IComparer] constraint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GivenSequenceSequencer] using a given [IComparer] for the sequencing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23GivenSequenceSequencer-constructor-GivenSequenceSequencer">Online Documentation</a>
 * 
 * @property sequenceComparer
 * Gets or sets the [IComparer] used by this [GivenSequenceSequencer] to determine the sequence of the nodes.
 * 
 * Default value - `null`. No [IComparer] is specified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23sequenceComparer">Online Documentation</a>
 */
external open class GivenSequenceSequencer  (
open var sequenceComparer: IComparer<in Node>? = definedExternally) : ISequencer {

/**
 * Calculates the sequence of the nodes within a [ILayers] instance based on the given [IComparer] instance.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance containing the elements of the layers
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [itemFactory] the [IItemFactory] used for creating and destroying helper structures
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenSequenceSequencer%23GivenSequenceSequencer-method-sequenceNodeLayers">Online Documentation</a>
 */
 override   fun sequenceNodeLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : ClassMetadata<GivenSequenceSequencer> {
}
}

inline fun GivenSequenceSequencer(
    block: GivenSequenceSequencer.() -> Unit
): GivenSequenceSequencer {
    return GivenSequenceSequencer()
        .apply(block)
}
