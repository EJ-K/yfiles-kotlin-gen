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
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * This interface is used by [HierarchicLayoutCore] to calculate the order of the nodes within each [layer][ILayers].
 * @see [HierarchicLayoutCore.sequencer]
 * @see [HierarchicLayout.fixedElementsSequencer]
 * @see [HierarchicLayout.fromScratchSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequencer">Online Documentation</a>
 */
external interface ISequencer : YObject {
/**
 * Calculates the sequence of the nodes within each [layer][ILayers].
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance containing the elements in the layering
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [IItemFactory] used temporarily for modifying the graph instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISequencer%23ISequencer-method-sequenceNodeLayers">Online Documentation</a>
 */
   fun sequenceNodeLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : InterfaceMetadata<ISequencer> {
}
}
