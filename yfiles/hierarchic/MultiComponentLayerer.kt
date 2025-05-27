// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import js.array.ReadonlyArray
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a wrapper [ILayerer] implementation that delegates the actual layering to a delegate [ILayerer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [MultiComponentLayerer] using the given [ILayeredComponentsMerger] and [IComparer] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23MultiComponentLayerer-constructor-MultiComponentLayerer">Online Documentation</a>
 */
external open class MultiComponentLayerer  ( singleComponentLayerer: ILayerer ,
 merger: ILayeredComponentsMerger?  = definedExternally,
 componentComparer: IComparer<in Node>?  = definedExternally) : ILayerer {

/**
 * Gets or sets the component [IComparer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23componentComparer">Online Documentation</a>
 */
open var componentComparer: IComparer<in Node>?
/**
 * Gets or sets the [merger][ILayeredComponentsMerger] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23merger">Online Documentation</a>
 */
open var merger: ILayeredComponentsMerger
/**
 * Gets or sets the delegate [ILayerer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23singleComponentLayerer">Online Documentation</a>
 */
open var singleComponentLayerer: ILayerer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23MultiComponentLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Sorts an array which consists of [NodeList]s each of which contains nodes that belong to the same component.
 * @param [nodeLists] the array of [NodeList]s each of which containing nodes that belong to the same component
 * @param [componentIndexProvider] the [IDataProvider] that returns an object (the component index) for each node (this value can be either integer or object)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiComponentLayerer%23MultiComponentLayerer-method-sort">Online Documentation</a>
 */
 open protected   fun sort( nodeLists: ReadonlyArray<NodeList> ,
 componentIndexProvider: IDataProvider<Node, *> )

companion object : ClassMetadata<MultiComponentLayerer> {
}
}
