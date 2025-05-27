// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [Path] represents the result of a path search as a list of consecutive [CellEntrance]s.
 * @see [PathSearch]
 * @see [PathSearchResult]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [Path] for the given edge, [cell entrances][CellEntrance] and cost.
 * @param [entrances] the list of [CellEntrance] objects describing the edge path from source node to target node
 * @param [cost] the overall cost of this path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23Path-constructor-Path">Online Documentation</a>
 * 
 * @property cost
 * Gets the overall cost of this path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23cost">Online Documentation</a>
 */
@JsName("EdgeRouterPath")
external open class Path  (
 entrances: IList<out CellEntrance> ,
open val cost: Double) : YObject {

/**
 * Returns the [CellEntrance] at the given position of this path.
 * @param [position] the position of the [CellEntrance] to return
 * @return the [CellEntrance] at the given position of this path
 * @see [setEntrance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23Path-method-getEntrance">Online Documentation</a>
 */
 open   fun getEntrance( position: Int ):CellEntrance
/**
 * Returns the number of [CellEntrance] objects in this path.
 * @return the number of [CellEntrance] objects in this path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23Path-method-length">Online Documentation</a>
 */
 open   fun length():Int
/**
 * Returns the position of the first occurrence of the given [CellEntrance] in this path, or `-1` if this path does not contain this [CellEntrance].
 * @param [entrance] the [CellEntrance] for which the position is retrieved
 * @return the position of the first occurrence of the given [CellEntrance] in this path, or `-1` if this path does not contain this [CellEntrance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23Path-method-positionOf">Online Documentation</a>
 */
 open   fun positionOf( entrance: CellEntrance ):Int
/**
 * Replaces the [CellEntrance] at the given position of this path with the given [CellEntrance].
 * @param [position] the position of the [CellEntrance] to replace
 * @param [entrance] the [CellEntrance] to be stored at the given position
 * @see [getEntrance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterPath%23Path-method-setEntrance">Online Documentation</a>
 */
 open   fun setEntrance( position: Int ,
 entrance: CellEntrance )

companion object : ClassMetadata<Path> {
}
}
