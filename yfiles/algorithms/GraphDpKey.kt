// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YClass

/**
 * This class is used as look-up key for registering [IDataProvider] for the [Graph] itself with a graph.
 * @param [TValue] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @see [Graph.addDataProvider]
 * @see [Graph.getDataProvider]
 * @see [Graph.removeDataProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDpKey">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphDpKey] class.
 * @param [valueType] The type of the values that are returned by the [IDataProvider] registered with this class.
 * @param [declaringType] Type that declares this key. If this key is used with the [LayoutExecutorAsync][yfiles.layout.LayoutExecutorAsync], then it must be set to `null`.
 * @param [name] The name of this key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphDpKey%23GraphDpKey-constructor-GraphDpKey">Online Documentation</a>
 */
external open class GraphDpKey<TValue : Any>  ( valueType: YClass<TValue> ,
 declaringType: YClass<*> ,
 name: String ) : DpKeyBase<Graph, TValue> {

companion object : ClassMetadata<GraphDpKey<*>> {
}
}
