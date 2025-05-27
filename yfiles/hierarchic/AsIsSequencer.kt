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
import yfiles.layout.LayoutGraph

/**
 * This class calculates the sequence of the nodes within each layer using the nodes' coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsSequencer">Online Documentation</a>
 * 
 * @constructor Creates a new [AsIsSequencer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsSequencer%23AsIsSequencer-constructor-AsIsSequencer">Online Documentation</a>
 */
external open class AsIsSequencer  () : ISequencer {

/**
 * Calculates the sequence of the nodes within each layer using the nodes' coordinates.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance that defines the layering structure
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [itemFactory] the [IItemFactory] used for creating and destroying helper structures
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsSequencer%23AsIsSequencer-method-sequenceNodeLayers">Online Documentation</a>
 */
 override   fun sequenceNodeLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : ClassMetadata<AsIsSequencer> {
}
}
