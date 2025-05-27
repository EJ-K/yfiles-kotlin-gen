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
 * This interface is used by classes capable of generating a layer assignment.
 * @see [HierarchicLayoutCore.layerer]
 * @see [HierarchicLayout.fixedElementsLayerer]
 * @see [HierarchicLayout.fromScratchLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerer">Online Documentation</a>
 */
external interface ILayerer : YObject {
/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for querying information about the nodes and edges
 * @see [ILayers.insert]
 * @see [ILayer.add]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayerer%23ILayerer-method-assignLayers">Online Documentation</a>
 */
   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : InterfaceMetadata<ILayerer> {
}
}
