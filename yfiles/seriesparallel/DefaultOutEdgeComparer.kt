// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.algorithms.Edge
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * [DefaultOutEdgeComparer] is the default implementation for the out-edge comparator used in [SeriesParallelLayout].
 * @see [SeriesParallelLayout.defaultOutEdgeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultOutEdgeComparer">Online Documentation</a>
 * 
 * @constructor Creates a [DefaultOutEdgeComparer] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultOutEdgeComparer%23DefaultOutEdgeComparer-constructor-DefaultOutEdgeComparer">Online Documentation</a>
 */
external open class DefaultOutEdgeComparer  () : IComparer<Edge> {

/**
 * Compares the two given edges considering their [PortConstraint][yfiles.layout.PortConstraint]s.
 * @param [x] the first edge
 * @param [y] the second edge
 * @return the order of the given two edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultOutEdgeComparer%23DefaultOutEdgeComparer-method-compare">Online Documentation</a>
 */
 override   fun compare( x: Edge ,
 y: Edge ):Int

companion object : ClassMetadata<DefaultOutEdgeComparer> {
}
}
