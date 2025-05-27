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
 * This interface is responsible for assigning port coordinates to the adjacent edges of each node of the graph.
 * @see [HierarchicLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortAllocator">Online Documentation</a>
 */
external interface IPortAllocator : YObject {
/**
 * Assigns to each edge of the graph a source port and target port coordinate pair.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance containing the elements in the layering
 * @param [ldp] the [ILayoutDataProvider] containing layering information about the nodes and edges of the graph
 * @param [itemFactory] the [IItemFactory] used temporarily for modifying the graph instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortAllocator%23IPortAllocator-method-assignPorts">Online Documentation</a>
 */
   fun assignPorts( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : InterfaceMetadata<IPortAllocator> {
}
}
