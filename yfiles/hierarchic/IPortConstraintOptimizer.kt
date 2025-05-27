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
 * This interface serves as a callback for [HierarchicLayoutCore] after the layering and sequencing phases.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortConstraintOptimizer">Online Documentation</a>
 */
external interface IPortConstraintOptimizer : YObject {
/**
 * Assigns new temporary port constraints after the layering information has been determined.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance
 * @param [ldp] the [ILayoutDataProvider] containing information about the elements
 * @param [itemFactory] the [IItemFactory] to set the temporary port constraints with
 * @see [IItemFactory.setTemporaryPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortConstraintOptimizer%23IPortConstraintOptimizer-method-optimizeAfterLayering">Online Documentation</a>
 */
   fun optimizeAfterLayering( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Assigns new temporary port constraints after the sequence of the nodes has been determined.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance
 * @param [ldp] the [ILayoutDataProvider] containing information about the elements
 * @param [itemFactory] the [IItemFactory] to set the temporary port constraints with
 * @see [IItemFactory.setTemporaryPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortConstraintOptimizer%23IPortConstraintOptimizer-method-optimizeAfterSequencing">Online Documentation</a>
 */
   fun optimizeAfterSequencing( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : InterfaceMetadata<IPortConstraintOptimizer> {
}
}
