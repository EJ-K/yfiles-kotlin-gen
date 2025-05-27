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
 * This interface is responsible for the assignment of the x-(sequence) and preliminary y-coordinates of the nodes in a hierarchic layout.
 * @see [SimplexNodePlacer]
 * @see [IDrawingDistanceCalculator]
 * @see [HierarchicLayoutCore]
 * @see [HierarchicLayoutCore.nodePlacer]
 * @see [HierarchicLayout.nodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHierarchicLayoutNodePlacer">Online Documentation</a>
 */
@JsName("IHierarchicLayoutNodePlacer")
external interface INodePlacer : YObject {
/**
 * Assigns preliminary y-coordinates for each layer of a hierarchic layout.
 * @param [graph] the input graph
 * @param [layoutDataProvider] the [ILayoutDataProvider] containing information about the elements
 * @param [layers] the [ILayers] instance that will be calculated by this method
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHierarchicLayoutNodePlacer%23INodePlacer-method-assignLayerCoordinates">Online Documentation</a>
 */
   fun assignLayerCoordinates( graph: LayoutGraph ,
 layoutDataProvider: ILayoutDataProvider ,
 layers: ILayers )
/**
 * Determines the resulting x-coordinates of a hierarchic layout.
 * @param [graph] the input graph
 * @param [layoutDataProvider] the [ILayoutDataProvider] containing information about the elements
 * @param [layers] the [ILayers] instance that will be calculated by this method
 * @param [drawingDistanceCalculator] the given [IDrawingDistanceCalculator] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHierarchicLayoutNodePlacer%23INodePlacer-method-assignSequenceCoordinates">Online Documentation</a>
 */
   fun assignSequenceCoordinates( graph: LayoutGraph ,
 layoutDataProvider: ILayoutDataProvider ,
 layers: ILayers ,
 drawingDistanceCalculator: IDrawingDistanceCalculator )

companion object : InterfaceMetadata<INodePlacer> {
}
}
