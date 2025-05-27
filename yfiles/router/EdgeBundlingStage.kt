// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundling
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * A [ILayoutStage][yfiles.layout.ILayoutStage] that bundles the edges of general undirected graphs to avoid visual cluttering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStage">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeBundlingStage] instance with the given optional core layout algorithm and default settings.
 * @param [core] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStage%23EdgeBundlingStage-constructor-EdgeBundlingStage">Online Documentation</a>
 */
external open class EdgeBundlingStage  ( core: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStage%23edgeBundling">Online Documentation</a>
 */
open val edgeBundling: EdgeBundling
/**
 * Gets or sets the maximum duration in milliseconds that this bundling algorithm is allowed to run.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The bundling algorithm runs unrestricted.
 * @throws ArgumentError if the specified duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStage%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Applies the edge bundling algorithm after invoking the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStage%23EdgeBundlingStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<EdgeBundlingStage> {
}
}

inline fun EdgeBundlingStage(
    block: EdgeBundlingStage.() -> Unit
): EdgeBundlingStage {
    return EdgeBundlingStage()
        .apply(block)
}
