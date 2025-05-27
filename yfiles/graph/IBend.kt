// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IPoint
import yfiles.lang.InterfaceMetadata

/**
 * The interface used in an [IGraph] implementation to control the layout of [edges][IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBend">Online Documentation</a>
 */
external interface IBend : IModelItem {
/**
 * Gets the index of the bend at its [owner].
 * @see [IGraph.addBend]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBend%23index">Online Documentation</a>
 */
final val index: Int
/**
 * Gets the location of the bend in the world coordinate system.
 * @see [IPoint.toPoint]
 * @see [IGraph.setBendLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBend%23location">Online Documentation</a>
 */
val location: IPoint
/**
 * Gets the edge this bend instance belongs to.
 * @see [IGraph.addBend]
 * @see [IEdge.bends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBend%23owner">Online Documentation</a>
 */
val owner: IEdge?

companion object : InterfaceMetadata<IBend> {
}
}
